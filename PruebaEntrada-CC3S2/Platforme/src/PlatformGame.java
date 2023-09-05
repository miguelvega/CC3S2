import java.util.Arrays;

public class PlatformGame {
    public static void main(String[] args) {

        Plataform[] plataformas = {new Plataform(50, 50, 90),
                new Plataform(40, 40, 80),
                new Plataform(30, 30, 70),
                new Plataform(20, 20, 60),
                new Plataform(10, 10, 50)};

        int sumPlataformas = 0;
        for (int i = 0; i < plataformas.length; i++) {
            int contPlat = 2;
            for (int j = 0; j < plataformas.length; j++) {
                if(contPlat!=0) {
                    if (i != j ) {
                        if (plataformas[i].getY() > plataformas[j].getY() && (plataformas[i].getX2() > plataformas[j].getX1() && plataformas[i].getX1() < plataformas[j].getX2())) {
                            if(plataformas[i].getX1()>=plataformas[j].getX1() && plataformas[i].getX2()<=plataformas[j].getX2() ){
                                sumPlataformas += 2*plataformas[i].getY();
                            }
                            else{
                                sumPlataformas += plataformas[i].getY() - plataformas[j].getY();
                                contPlat--;
                            }
                        }


                    } else {

                        sumPlataformas += plataformas[i].getY();
                        contPlat--;
                    }
                    System.out.println(sumPlataformas);
                }
            }

        }
        System.out.println("Output: " + sumPlataformas);
    }

}
