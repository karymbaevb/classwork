package kg.itacademy.fv21;

public class Aeroflot {
    private String destionation;
    private int flightNumber;
    private String aircraftType;

    public Aeroflot() {
    }

    public String getDestionation() {
        return this.destionation;
    }

    public void setDestionation(String destionation) {
        this.destionation = destionation;
    }

    public int getFlightNumber() {
        return this.flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return this.aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    @Override
    public String toString() {
        return "Aeroflot{destionation='" + this.destionation + '\'' + ", flightNumber=" + this.flightNumber + ", aircraftType='" + this.aircraftType + '\'' + '}';
    }
}
