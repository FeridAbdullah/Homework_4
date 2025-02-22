public class Pet {
    private Species species;
    private String nickname;

    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    @Override
    protected void finalize() {
        System.out.println("Pet object is being removed");
    }
}
