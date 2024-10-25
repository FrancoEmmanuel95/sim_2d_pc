package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import exceptions.Custom;
import model.Aeropuertos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Service {
    private List<Aeropuertos> aero = new ArrayList<>();

    File file = new File("archi.json");

    public void openFile() {
        ObjectMapper mapper = new ObjectMapper();
        //List<Aeropuertos> aero = new ArrayList<>();

        {
            try {
                aero = mapper.readValue(file, List.class);
                System.out.println(aero.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public ArrayList capMin(Integer cap) throws Custom {
        ArrayList<Aeropuertos> minAero = new ArrayList<>();
        Integer s = 0;
            try{while (this.aero.get(s) != null) {
                System.out.println(aero.get(s).toString());
            }
            } catch (ClassCastException e) {
                throw new RuntimeException(e);
            }
           /* for (Aeropuertos a : aero) {
                if(a.getCapacidad()>cap){
                    minAero.add(a);
                }
                else{
                    throw new Custom("la capacidad del aeropuerto es: " + a.getCapacidad());
                }*/
        return minAero;
            }



}
