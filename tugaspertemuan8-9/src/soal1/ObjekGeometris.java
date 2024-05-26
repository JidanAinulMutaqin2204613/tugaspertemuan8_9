package soal1;

/**
 *
 * @author Jidan Ainul Mutaqin
 */

public class ObjekGeometris {
    private String warna;
    private boolean terisi;

    public ObjekGeometris() {
        this.warna = "putih";
        this.terisi = false;
    }

    public ObjekGeometris(String warna, boolean terisi) {
        this.warna = warna;
        this.terisi = terisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public boolean isTerisi() {
        return terisi;
    }

    public void setTerisi(boolean terisi) {
        this.terisi = terisi;
    }
}


