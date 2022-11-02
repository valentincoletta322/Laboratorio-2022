package com.example.restservice;


import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.mongodb.client.model.Filters.eq;

@Service
public class DatosJson extends Acceso {
    public DatosJson() {
        super();
    }

    public boolean registrarUsuarios(String mail, String contraseña, String nombre, String apellido, String usuario){
        this.conectarABaseDeDatos("Chatllemi");
        this.conectarAColeccion("Usuario");
        if (!this.usuarioYaRegistrado(mail)){
            Document document =  new Document().append("mail", mail).append("contraseña", contraseña).append("nombre", nombre).append("apellido", apellido).append("usuario", usuario);
            this.getColeccion().insertOne(document);
            return true;
        }
        return false;
    }

    public boolean usuarioYaRegistrado(String mail){
        this.conectarABaseDeDatos("Chatllemi");
        this.conectarAColeccion("Usuario");
        FindIterable resultado = this.getColeccion().find();
        MongoCursor iterador = resultado.iterator();
        boolean existe = false;
        while (iterador.hasNext()){
            Document documento = (Document) iterador.next();
            String mailRegistrado = (String) documento.getString("mail");
            if (mailRegistrado.equals(mail)){
                existe = true;
            }
        }
        if (existe){
            return true;
        }
        return false;
    }

}
