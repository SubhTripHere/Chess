public class Player {
    Color color;
    String name;

    public Player(String name,Color color) {
        this.color = color;
        this.name = name;
    }
    public Color getColor() {
        return color;
    }
    public String getName() {
        return name;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setName(String name) {
        this.name = name;
    }
}
