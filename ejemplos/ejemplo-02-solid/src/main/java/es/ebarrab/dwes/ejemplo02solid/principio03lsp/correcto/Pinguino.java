package es.ebarrab.dwes.ejemplo02solid.principio03lsp.correcto;

public class Pinguino extends Ave {
    public void nadar() {
        System.out.println("Este pingüino está nadando");
    }

    @Override
    void mover() {
        nadar();
    }
}