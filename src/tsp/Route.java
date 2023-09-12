package src.tsp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Route {
    private boolean isFitnessChanged = true;
    private double fitness = 0;
    private ArrayList<City> cities = new ArrayList<City>();
    public Route(GeneticAlgorithm geneticAlgorithm){
        geneticAlgorithm.getInitialRoute().forEach(x->cities.add(null));
    }
    public Route(ArrayList<City> cities){
        this.cities.addAll(cities);
        Collections.shuffle(this.cities);
    }
    public double getFitness(){
        if (isFitnessChanged){
            fitness = (1/totalDistance())*1000;
            return fitness;
        }
        return fitness;
    }
    public double totalDistance(){
        int numOfCities = this.cities.size();
        int sum = 0;

        for (int cityIndex = 0; cityIndex < numOfCities; cityIndex++){
            double returnValue = 0;
            City currentCity = this.cities.get(cityIndex);

            if (cityIndex < numOfCities -1){
                City nextCity = this.cities.get(cityIndex+1);
                returnValue = currentCity.measureDistance(nextCity);
            }
            sum += returnValue;
        }
        City firstCity = this.cities.get(0);
        City lastCity = this.cities.get(numOfCities - 1);
        sum += firstCity.measureDistance(lastCity);

        return sum;
    }
    @Override
    public String toString(){
        return Arrays.toString(cities.toArray());
    }
    public ArrayList<City> getCities(){
        isFitnessChanged = true;
        return cities;
    }
}
