package models;

import controller.Bolsillo;

public class DaviplataDao extends Bolsillo {

    int saldo = 0;

    int saldo_recarga;
    int saldo_retiro;
    int recarga;
    int retira;
    int saldoTotal;

    public int recargarSaldo() {

        saldo_recarga = saldo + recarga;
        return saldo_recarga;

    }

    public int consultarSaldo() {

        saldoTotal = saldo_recarga + saldo_retiro;
        return saldoTotal;

    }

    public int retirarSaldo() {

        saldo_retiro = saldo - retira;

        return saldo_retiro;

    }

    public double ConsultarSaldoo() {
        throw new UnsupportedOperationException("Unimplemented method 'ConsultarSaldoo'");
    }

    @Override
    public double RetirarSaldo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'RetirarSaldo'");
    }

    @Override
    public double RecargarSaldo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'RecargarSaldo'");
    }
}
