import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cobra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cobra extends Actor
{
    /**
     * Act - do whatever the cobra wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int contadorMover;
    int atraso;
    int direcao;
    int Pontos;
    public void act() 
    { 
        movement();
        if(contadorMover == atraso){
        movement();
        checarColisao();
        contadorMover = 0;
        } else {
            contadorMover++;
        }
        checarBotaoPressionado();
        Pontos();
        getWorld().showText("Pontos" + pontos, 75, 35);
        getImage().scale(55, 53);
    }
    
    public cobra(){
        atraso = 5;
        direcao = 1;
    }
    public void movement(){
        int x=0, y=0;
        if(direcao == 0){
            setLocation(x, y - velocidadeDoMovimento);
        } else if (direcao == 1){
            setLocation(x - velocidadeDoMovimento, y);
        } else if (direcao == 2){
            setLocation(x, y + velocidadeDoMovimento);
        } else if (direcao == 3){
            setLocation(x + velocidadeDoMovimento, y);
        }
    }
}