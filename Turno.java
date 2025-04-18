package TresEnRaya;

public class Turno {
    private int turno;

    public Turno(int turno) {
        this.turno = turno;
    }

    public int quienToca() {
        return turno;
    }

    public int quienNoToca(){
        if(turno == 0){
            return 1;
        }else{
            return 0;
        }
    }

    public void cambiar(){
        if (turno == 0){
            this.turno = 1;
        }else {
            this.turno = 0;
        }
    }
}
