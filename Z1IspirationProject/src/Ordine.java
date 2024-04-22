import java.util.List;

class Ordine implements IRendibile {
    private String id;
    private List<Prodotto> prodotti;

    public Ordine(String id, List<Prodotto> prodotti) {
        this.id = id;
        this.prodotti = prodotti;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public List<Prodotto> getProdottiRendibili() {
        return prodotti;
    }
}


