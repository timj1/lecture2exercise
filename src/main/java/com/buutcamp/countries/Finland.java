package com.buutcamp.countries;

import com.buutcamp.interfaces.Country;

public class Finland implements Country {

    private String name = "Finland";

    private String president = "Sauli Niinistö";

    private String population = "5+miljoonaa";

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getPresident() {return president;}

    public void setPresident(String president) {this.president = president;}

    public String getPopulation() {return population;}

    public void setPopulation(String population) {this.population = population;}

}
