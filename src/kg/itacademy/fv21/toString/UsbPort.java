package kg.itacademy.fv21.toString;

public class UsbPort {
    private String typePort;
    private String idPort;

    public UsbPort(String typePort, String idPort) {
        this.typePort = typePort;
        this.idPort = idPort;
    }

    public String getTypePort() {
        return typePort;
    }

    public void setTypePort(String typePort) {
        this.typePort = typePort;
    }

    public String getIdPort() {
        return idPort;
    }

    public void setIdPort(String idPort) {
        this.idPort = idPort;
    }
}
