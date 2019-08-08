public enum Witch {
    WEST("Miss Gulch, aka the Wicked Witch of the West"),
    NORTH("Glinda, the Good Witch of the North"),
    EAST("Wicked Witch of the East, wearerof the Ruby " +
            "Slippers, crushed by Dorothy's house"),
    SOUTH("Good by interference, but missing");
    private String description;

    private Witch(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
