package Exercicio2;


public abstract class Animal {

    public abstract void fala();

    public static void main(String[] args) {
        Animal[] animais = new Animal[10];

        for (int i = 0; i< 10; i++) {
            switch ((int) (Math.random() * 3)) {
                case 0:
                    animais[i] = new Humano();
                    break;
                case 1:
                    animais[i] =  new Gato();
                    break;
                case 2:
                    animais[i] = new Cachorro();
                    break;
            }
        }

        for (int i = 0; i< 10; i++) {
            animais[i].fala();
        }
    }
}

