package com.example.alatmusiktradisional

import java.util.*

object instrumentsData {

    private val instrumentNames = arrayOf(
        "Angklung",
        "Bonang",
        "Gamelan",
        "Genggong",
        "Gong",
        "Kecapi",
        "Kendang",
        "Saluang",
        "Sasando",
        "Tifa"
    )

    private val instrumentDetails = arrayOf(
        "Alat musik berbahan dasar bambu ini tentunya sudah sangat terkenal di kalangan masyarakat. selain bentuknya yang unik, ternyata bunyi yang dihasilkan pun sangatlah merdu. Angklung berasal dari wilayah Jawa Barat dan sudah diakui sebagai warisan budaya Indonesia oleh UNESCO. Selain dimainkan sendiri, Angklung juga bisa dipadukan dengan alat musik seperti dalam orchestra atau pertunjukan seni.",
        "Bonang juga termasuk salah satu alat musik daerah yang patut untuk dilestarikan. Alat ini merupakan alat musik dari tanah Jawa khususnya Jawa Timur. Cara memainkannya yaitu dengan cara dipukul pada satu sisi atasnya. Seperti alat musik di Jawa lainnya, Bonang ternyata juga sudah sangat mendunia. Tidak sedikit pula wisatawan yang berkunjung langsung ke Indonesia untuk mempelajarinya. Biasanya bonang digunakan dalam acara perkawinan atau acara adat khususnya di Jawa.",
        "Alat musik tradisional lainnya yang juga berasal dari Pulau Jawa adalah Gamelan. Secara umum alat musik ini terdiri dari beberapa alat musik instrumen dasar maupun pengiring. Meski terbilang kuno, nyatanya gamelan masih banyak digunakan dalam beberapa acara seperti wayang, kuda lumping atau semacamnya. alat musik Gamelan memiliki ketertarikan tersendiri dimata dunia, Bahkan gamelan sudah menjadi kurikulum wajib di beberapa sekolah di Amerika dan New Zealand.",
        "Untuk masyarakat awam mungkin alat musik ini sangat asing di telinga. Genggong merupakan sebuah alat musik tradisional yang berasal dari Sumatra Selatan. Untuk memainkannya yaitu dengan cara ditiup layaknya harmonica. Uniknya, alat musik ini dulunya dipakai oleh para petani ketika beristirahat. Meski terbilang sederhana, nyatanya nada yang dihasilkan juga cukup merdu. Selain bentuknya yang simple nyatanya genggong juga menyimpan sejarah kearifan lokal bagi masyarakat di Sumatra Seleatan.",
        "Dari banyak alat musik darerah di Indonesia, gong juga termasuk alat musik yang sampai saat ini masih sering digunakan dalam pertunjua. Berbahan dasar dari Kuningan, alat ini mampu memberikan efek suara yang unik. Biasanya gong digunaka dalam pergelaran wayang atau kesenian masyarakat Jawa. Seiring dengan perkembangan jaman, gong bukan hanya sebagai alat musik saja. Bahkan saat ini gong juga digunakan sebagai simbol tanda perdamaian antar bangsa. Dan biasanya ukuran yang digunakan untuk simbol perdamaian dibuat cukup besar.",
        "Selain alat musik pukul, Indonesia juga memiliki alat musik petik lainnya yaitu kecapi, Asal mula alat musik ini adalah dari Sulawesi Barat. Meski memiliki bentuk yang sederhana, nada yang dihasilkan mampu memberikan kepasan tersendiri bagi pendengarnya. Dalam pertunjukan biasanya kecapi dimainkan seorang diri. Hal ini dikarenakan kecapi memiliki nada yang unik dan berbeda pada setiap senarnya, Suara yang dihasilkan alat musik ini sangat cocok untuk sarana relaksasi diri.",
        "Kendang Umumnya sering digunakan dalam pertunjukan bertema masyarakat Jawa khususnya Jawa Timur. Cara memainkannya adalah dengan cara dipukul, Terdapat 2 sisi yang bisa dipukul pada alat musik ini. Dan setiap sisi memiliki nada yang berbeda dan saat dimainkan biasanya akan disesuaikan dengan alat musik lainnya.",
        "Saluang adalah Alat musik tradisional dari wilayah Sumatra tepatya di Sumatra Barat, Alat musik yang perlu dilestarikan. Secara umum alat ini mirirp dengan suling, Tetapi ada perbedaan terutama pada lubang udarannya. Pada saluang hanya terdapat 4 lubang saja dan tentunnya nada yang dihasilkan lebih sederhana dibandingkan Suling. Selain sebagai alat musik tradisional, ternyata saluang juga memiliki nilai magis. Konon katanya alat ini mampu menghipnotis penontonnya.",
        "Selain bentuknya yang unik, suara yang dihasilkan pun sangatlah merdu. Hal yang membuat sasando unik adalah penggunaan bahan alami berupa daun lontar sebagai bahan utamanya. Alat musik ini merupakan alat musik khas Tanah Rote yaitu sebuah wilayah di Nusa Tenggara Timur. Cara memainkannya yaitu dengan cara dipetik layaknya gitar. Namun, tidak semua orang bisa memainkannya secara merdu karena harus memiliki teknik tertentu. Nama sasando sendiri mulai terkenal sejak digunakan dalam kontes acara WOW 2013.",
        "Di wilayah timur Indonesia tepatnuya di Papua ada alat musik daerah yang bernama Tifa. Ya, alat musik ini merupakan alat musik khas terutama untuk masyarakat Maluku dan Papua. Cara memainkan tifa adalah dengan cara dipukul dengan bentuk fisik seperti tube. Meski memiliki bentuk yang sederhana, ternyata tifa ini cukup diminati oleh turis yang sedang berkunjung. Tidak hanya itu, alat musik ini juga sering dibeli untuk oleh - oleh maupun cideramata. Uniknya lagi, di setiap pembuatan ada diberi ukiran khas Maluku dan Papua yang membuat nilai estetika alat ini semakin tinggi."
    )

    private val instrumentImages = intArrayOf(
        R.drawable.angklung,
        R.drawable.bonang,
        R.drawable.gamelan,
        R.drawable.genggong,
        R.drawable.gong,
        R.drawable.kecapi,
        R.drawable.kendang,
        R.drawable.saluang,
        R.drawable.sasando,
        R.drawable.tifa
    )

    val listData: ArrayList<Instrument>
        get() {
            val list = arrayListOf<Instrument>()
            for (position in instrumentNames.indices) {
                val instrument = Instrument()
                instrument.name = instrumentNames[position]
                instrument.detail = instrumentDetails[position]
                instrument.photo = instrumentImages[position]
                list.add(instrument)
            }
            return list
        }

}