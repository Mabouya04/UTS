package com.example.uts.data

import com.example.uts.R
import com.example.uts.model.Laptops

class Datasource {
    fun loadLaptops(): List<Laptops>{
        return listOf<Laptops>(
            Laptops(R.string.laptop1,R.drawable.asus_fx505dy),
            Laptops(R.string.laptop2,R.drawable.asus_g14),
            Laptops(R.string.laptop3,R.drawable.asus_f15),
            Laptops(R.string.laptop4,R.drawable.msi_modern14),
            Laptops(R.string.laptop5,R.drawable.asus_zephyrus15),
            Laptops(R.string.laptop6,R.drawable.asus_gl553vd),
            Laptops(R.string.laptop7,R.drawable.acer_helios300),
            Laptops(R.string.laptop8,R.drawable.msi_katanagf66),
            Laptops(R.string.laptop9,R.drawable.lenovo_legion7i),
            Laptops(R.string.laptop10,R.drawable.lenovo_legiony530)

        )
    }
}