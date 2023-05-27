# Intent
#### Intent adalah mekanisme untuk melakukan sebuah action dan komunikasi antar komponen aplikasi misal Activity, Service, dan Broadcast Receiver.
#### Ada tiga penggunaan umum intent dalam aplikasi Android yaitu:
- Memindahkan satu activity ke activity lain dengan atau tidak membawa data.
- Menjalankan background service, misalnya melakukan sinkronisasi ke server dan menjalankan proses berulang (periodic/scheduler task).
- Mengirimkan obyek broadcast ke aplikasi yang membutuhkan. Misal, ketika aplikasi membutuhkan proses menjalankan sebuah background service setiap kali aplikasi selesai melakukan booting. Aplikasi harus bisa menerima obyek broadcast yang dikirimkan oleh sistem Android untuk event booting tersebut.
![alt text](https://github.com/syafiqfajrianemha/intent-app-kotlin/blob/main/ui-intent-app.png?raw=true)
## Rangkuman Intent
- Intent memiliki dua bentuk yaitu:
  - **Explicit Intent**: digunakan untuk menjalankan komponen lain dengan tujuan yang sudah jelas atau eksplisit. Biasanya digunakan untuk berpindah ke Activity lain pada satu aplikasi.
  - **Implicit Intent**: digunakan untuk menjalankan komponen lain dengan tujuan yang belum jelas alias implisit. Biasanya digunakan untuk melakukan aksi tertentu dengan berpindah ke aplikasi lain, misalnya membuka maps, camera, atau foto. Jika ada lebih dari satu aplikasi yang bisa menangani aksi tersebut, opsi aplikasi akan muncul. Contohnya ketika membuka maps, pilihannya bisa menggunakan Google Maps atau Waze.
- Fungsi **putExtra(key, value)** digunakan untuk menambahkan data di dalam Intent dengan bentuk key-value.
- Fungsi **intent.getFooExtra(key)** digunakan untuk mengambil data berdasarkan key. Dengan “Foo” adalah tipe data dari dari data yang dikirim.
- **Parcelabl**e adalah suatu interface yang memungkinkan kita melakukan pengiriman satu objek sekaligus di dalam Intent.
- **Parcelize** adalah plugin yang dapat digunakan untuk membuat implementasi Parcelable secara otomatis.
- Fungsi **setResult** digunakan untuk mengirimkan nilai balik ke Activity yang memanggilnya.
- Fungsi **registerForActivityResult** digunakan untuk menerima data yang dikirimkan oleh setResult dari Activity lain. Fungsi ini mengembalikan objek **ActivityResultLauncher** yang digunakan untuk menjalankan Activity lain.
- Fungsi **finish()** digunakan untuk menutup/menghancurkan Activity dan kembali ke Activity sebelumnya.
