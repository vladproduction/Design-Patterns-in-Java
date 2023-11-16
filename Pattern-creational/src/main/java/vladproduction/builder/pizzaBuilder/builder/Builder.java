package vladproduction.builder.pizzaBuilder.builder;

public interface Builder<T,S,B> {
    void setModelType(T modelType);
    void setModelSize(S modelSize);
    void setModelPrice(int modelPrice);
    void setModelBox(B modelBox);

}
