/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caralibrobd;

import java.util.ArrayList;

/**
 *
 * @author a22alejandrofc
 */
public final class CaraLibroBD {

    ArrayList<Perfil> Collection = new ArrayList<>();

    public Perfil obterPerfil(String nome, String contrasinal) {

        for (int i = 0; i < Collection.size(); i++) {
            if (nome == Collection.get(i).nome && contrasinal == Collection.get(i).contrasinal) {

                return Collection.get(i);

            }

        }

        return null;

    }

    public Perfil buscarPerfil(String nome) {

        for (int a = 0; a < Collection.size(); a++) {
            if (nome == Collection.get(a).nome) {

                return Collection.get(a);

            }

        }

        return null;

    }
    
    public Perfil engadirPerfil (Perfil novoPerfil){
        
        Collection.add(novoPerfil);
        
        return null;
    }
}
