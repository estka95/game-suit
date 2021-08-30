class Pemain(var nama:String) {
    lateinit var nilai:String
    fun input():Unit{
        do {
            //munculkan tangan player
            println("Masukkan pilihan $nama:")
            nilai = readLine().toString().lowercase()
        } while (Validasi(nilai)==false)
    }

}