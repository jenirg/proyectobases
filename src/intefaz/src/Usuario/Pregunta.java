/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class Pregunta {

    private String[] preguntas = {"¿Cuál es el nombre de su primera mascota?", "¿Cuál es el nombre de su primera maestra?", "¿Cuál es su comida favorita?", "¿Cuál es su película favorita?", "¿Cuál es su pasa tiempo favorito?"};

    public String pos_pregunta() {
        String pregunta="";
        int numero = (int) (Math.random() * 4 + 0);
        for (int i = 0; i < 5; i++) {
            if (numero == i) {
                pregunta=  preguntas[i];
            } else if (numero == i) {
                pregunta=  preguntas[i];

            } else if (numero == i) {
                pregunta=  preguntas[i];

            } else if (numero == i) {
                pregunta= preguntas[i];

            } else if (numero == i) {
                pregunta= preguntas[i];

            }
        }
        return pregunta;
    }

}
