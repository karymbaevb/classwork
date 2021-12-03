package kg.itacademy.fv21.toString;

public class Klavishi {
    private int[] arrayRaskladok;
    private boolean hasPodsvetka;
    private boolean hisRightDigits;

    public Klavishi(int[] arrayRaskladok, boolean hasPodsvetka, boolean hisRightDigits) {
        this.arrayRaskladok = arrayRaskladok;
        this.hasPodsvetka = hasPodsvetka;
        this.hisRightDigits = hisRightDigits;
    }

    public int[] getArrayRaskladok() {
        return arrayRaskladok;
    }

    public void setArrayRaskladok(int[] arrayRaskladok) {
        this.arrayRaskladok = arrayRaskladok;
    }

    public boolean isHasPodsvetka() {
        return hasPodsvetka;
    }

    public void setHasPodsvetka(boolean hasPodsvetka) {
        this.hasPodsvetka = hasPodsvetka;
    }

    public boolean isHisRightDigits() {
        return hisRightDigits;
    }

    public void setHisRightDigits(boolean hisRightDigits) {
        this.hisRightDigits = hisRightDigits;
    }

}
