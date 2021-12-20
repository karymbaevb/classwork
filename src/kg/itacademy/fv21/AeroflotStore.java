package kg.itacademy.fv21;

public class AeroflotStore {
    private final Aeroflot[] aeroflots = new Aeroflot[3];

    public AeroflotStore() {
    }

    public void setSingleAeroflot(Aeroflot aeroflot) {
        for (int i = 0; i < this.aeroflots.length; ++i) {
            if (this.aeroflots[i] == null) {
                this.aeroflots[i] = aeroflot;
                break;
            }
        }

    }

    public Aeroflot searchAeroflotByType(String type) {
        Aeroflot[] var2 = this.aeroflots;
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            Aeroflot aeroflot = var2[var4];
            if (aeroflot != null && aeroflot.getAircraftType().equals(type)) {
                return aeroflot;
            }
        }

        return null;
    }

    public void showAll() {
        Aeroflot[] var1 = this.aeroflots;
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            Aeroflot aeroflot = var1[var3];
            if (aeroflot != null) {
                System.out.println(aeroflot);
            }
        }

    }

    public void sortByBubble() {
        for (int i = 0; i < this.aeroflots.length; ++i) {
            for (int j = 0; j < this.aeroflots.length - 1; ++j) {
                if (this.aeroflots[i].getFlightNumber() < this.aeroflots[j].getFlightNumber()) {
                    Aeroflot temp = this.aeroflots[i];
                    this.aeroflots[i] = this.aeroflots[j];
                    this.aeroflots[j] = temp;
                }
            }
        }

    }
}

