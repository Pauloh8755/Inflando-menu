package com.example.menu_datepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Método que carrega o menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //método para inflar nosso  menu
        menuInflater.inflate(R.menu.menu_cadastro, menu)
        return true
    }

    //Método para detectar qual item foi clicado
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //testando qual item foi selecionado
        if(item.itemId == R.id.menu_sair) {
            finish()
        }
        else if(item.itemId == R.id.menu_salvar){
            Log.i("xpto", "Salvando...")
        }
        else if(item.itemId == R.id.menu_config){
            Log.i("xpto", "Config")
        }
        else if(item.itemId == R.id.menu_perfil){
            Log.i("xpto", "Perfil")
        }
        return true
    }
}