public class Country {

    public int population;

    public Country(int population, String countryName) {
        this.population = population;
        CountryName = countryName;
    }

    public String CountryName;

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }
}
