package model;


public class Menu {
    private String idMenu;
    private String Menu;
    private String category;
    private Integer price;
    private String description;

    public Menu(){

    }

    public Menu(String idMenu, String Menu, String category, Integer price, String description){
        this.idMenu = idMenu;
        this.Menu = Menu;
        this.category = category;
        this.price = price;
        this.description = description;
    }

    public String getIdMenu() {
        return this.idMenu;
    }

    public void setIdMenu(String idMenu) {
        this.idMenu = idMenu;
    }

    public String getMenu() {
        return this.Menu;
    }

    public void setMenu(String Menu) {
        this.Menu = Menu;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("╔═════════════════════════════════════════╗\n");
    sb.append("║               Menu Information           ║\n");
    sb.append("╟─────────────────────────────────────────╢\n");
    sb.append("║ Id Menu:    ").append(getIdMenu()).append("║\n");
    sb.append("║ Menu:       ").append(getMenu()).append("║\n");
    sb.append("║ Category:   ").append(getCategory()).append("║\n");
    sb.append("║ Price:      ").append(getPrice()).append("║\n");
    sb.append("║ Description:").append(getDescription()).append("║\n");
    sb.append("╚═════════════════════════════════════════╝\n");
    return sb.toString();
}


    public static void add(Menu menu) {
    }

}

