package nahida;

import excecao.controllerException;

public class data {

    private int dia, mes, ano;
    private boolean bissexto;

    public data(int dia, int mes, int ano) throws controllerException {

        if(dataSimOuNao(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }
    protected boolean dataSimOuNao(int dia, int mes, int ano) throws controllerException{

        bissexto = ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0);

        if (ano > 0 && dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12) {
            if ((mes == 2 && bissexto && dia <= 29) || (mes == 2 && !bissexto && dia <= 28) || ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30 ) || (mes != 2 && mes != 4 && mes != 6 && mes != 9 && mes != 11)) {
                return true;
            }else{
                throw new controllerException("Data Invalida!");
            }
        }

        return false;
    }

    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }

    public String dataCompleta(){
        return getDia()+"/"+getMes()+"/"+getAno();
    }

    public boolean setData(int dia, int mes, int ano) throws controllerException {

        if(dataSimOuNao(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;

            return true;
        }
        return false;
    }

    public boolean proxData(int quant) throws controllerException{

        if(quant <=0){
            throw new controllerException("Rapaz, ta certo isso?");
        }

        int[] diaMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(bissexto){
            diaMes[2] = 29;
        }

        for(int i = 0; i < quant; i++){
            dia++;

            if(dia> diaMes[mes]){
                dia = 1;
                mes++;
            }
            if(mes>12){
                mes = 1;
                ano++;
            }
            if(!bissexto){
                diaMes[2] = 29;
            }
        }
        return true;
    }
}
