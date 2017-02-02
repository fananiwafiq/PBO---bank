/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import javax.swing.JOptionPane;

/**
 *
 * @author wafiq
 */
class tarik {
private int saldo;
public void ambil (int tab, int t){
    if(t%100!=0)
        JOptionPane.showMessageDialog(null,"Mesin ATM BRI tidak menerima uang koin \n Silahkan lakukan penyetoran","Transaksi Gagal",0);
    {
        if(t>tab)
            JOptionPane.showMessageDialog(null,"Saldo Anda Tidak mencukupi \n Silahkan lakukan penyetoran","Transaksi Gagal",0);
        else if(t<50000)
            JOptionPane.showMessageDialog(null,"Besaran minimal pengambilan tuani adalah Rp 50000","Transaksi Gagal",0);
        else{
            saldo = tab-t;
            JOptionPane.showMessageDialog(null,"Saldo Anda saat ini sebesar :" +saldo);
            if(tab<=50000)
                JOptionPane.showMessageDialog(null,"Saldo minimal harus Rp 50000,00,"
                        + "Segera lakukan penyetoran untuk menghindari penutupan akun.","CAUTION",2);
        }
    } 
}
public int getsaldo()
{
    return saldo;
}

    void menabung(int tab, int s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
}
