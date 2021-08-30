class InputTangan(tangan1: String, tangan2: String, namaPlayer1: String, namaPlayer2: String){
    var pilihan1: String
    var pilihan2: String
    var nama1: String
    var nama2: String

    init {
        pilihan1 = tangan1
        pilihan2 = tangan2
        nama1 = namaPlayer1
        nama2 = namaPlayer2

        hasilTangan(pilihan1,pilihan2,nama1,nama2)
    }
//hasil suit dari tangan yang dipanggil
    fun hasilTangan(tangan1: String, tangan2: String, nama1: String, nama2: String) {
        if (tangan1 == tangan2) {
            println("Draw")
        } else if (tangan1 == "batu" && tangan2 == "gunting" ||
            tangan1 == "gunting" && tangan2 == "kertas" ||
            tangan1 == "kertas" && tangan2 == "batu") {
            println("Horee ${this.nama1} menang!")
        } else if (tangan2 == "batu" && tangan1 == "gunting" ||
            tangan2 == "gunting" && tangan1 == "kertas" ||
            tangan2 == "kertas" && tangan1 == "batu") {
            println("Horee ${this.nama2} menang!")
        } else {
            println("Masukkan hanya batu, gunting, atau kertas")
        }

    }
}