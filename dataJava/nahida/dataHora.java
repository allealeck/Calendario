package nahida;

import excecao.controllerException;

public class dataHora extends data{

    private int hora, minuto, segundo, horaCompleta;

    public dataHora(int dia,int mes,int ano,int hora,int minuto,int segundo) throws controllerException{
        super(dia, mes, ano);

        if(horaSimOuNao(hora,minuto,segundo)){
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }
    }

    public boolean horaSimOuNao(int hora,int minuto,int segundo) throws controllerException{
        if(hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59 && segundo >= 0 && segundo <= 59){
            return true;
        }else{
            throw new controllerException("Hora Invalida!");
        }
    }

    public void setHora(int dia,int mes,int ano,int hora,int minuto,int segundo)throws controllerException {

        if(horaSimOuNao(hora,minuto,segundo)){
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
            super.setData(dia,mes,ano);
        }
    }

    public int getHora() {
        return hora;
    }
    public int getMinuto() {
        return minuto;
    }
    public int getSegundo() {
        return segundo;
    }

    public String HoraCompleta(){
        return getHora()+":"+getMinuto()+":"+getSegundo();
    }

    public String DataHorario(){
        return super.dataCompleta()+"\n"+HoraCompleta();
    }
}
