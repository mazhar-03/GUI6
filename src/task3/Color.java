package task3;

public enum Color {
    Yellow, Red, Blue, Green, Orange, Violet;
    public static Color mixColors(Color a, Color b){
        return switch (a.ordinal() + b.ordinal()) {
            case 1 -> Color.Orange;
            case 2 -> Color.Green;
            case 3 -> Color.Violet;
            default -> null;
        };
    }
}
