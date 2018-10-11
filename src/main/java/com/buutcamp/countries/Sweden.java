package com.buutcamp.countries;

import com.buutcamp.interfaces.Country;

public class Sweden implements Country {

    private String name = "Sweden";

    private String president = "Öö joku";

    private String population = "10M tai jotain";

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getPresident() {return president;}

    public void setPresident(String president) {this.president = president;}

    public String getPopulation() {return population;}

    public void setPopulation(String population) {this.population = population;}

}
