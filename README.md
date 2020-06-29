# APPL1-SOLID
Latihan Prisnsip SOLID oleh Hanifah Sholihat 181524012

## 1. Stream Progress
Tujuan dari latihan ini yaitu melakukan refactor agar StreamProgressInfo dapat bekerja dengan berbagai jenis Streaming. Dalam hal ini diterapkan **Open/Closed Principle (OCP)** dimana suatu kelas harus **"open"** terhadap ekstensi tetapi **"close"** untuk modifikasi. OCP dilakukan dengan membuat interface yaitu IStreamable yang memiliki abstract method Length dan abstract method  Bytes dan kelas Streamable( File dan Music) mengimplementasikan interface IStreamable. Sehingga dengan prinsip ini kita dapat menambah fitur baru tanpa mengubah suatu kelas yang telah dibuat .

Selain itu, terdapat prinsip lain yang diterapkan yaitu **Liskov Subtitute Principle (LSP)**  dengan membuat StreamProgressInfo memiliki tipe IStreamable. Jadi,setiap kelas yang mengimplementasikan IStremable dapat dilewatkan sebagai argumen ke dalam kelas StreamProgresInfo. 
## 2. Graphic Editor
Tujuan dari Latihan ini, yaitu kelas **GraphicEditor** dapat menggambar semua jenis bentuk(shape) tanpa harus mengecek, bentuk mana yang akan digambar dan ketika ada penambahan bentuk baru, hanya perlu menambahkan kelas saja.

Untuk mencapi tujuan tersebut, maka prinsiP yang diterapkan adalah **Open/Closed Principle** Dengan membuat interface **IShape** yang memiliki abstract method draw. Setiap kelas Shape mengimplementasikan interface IShape. Sehingga dapat dengan mudah melakukan draw pada class GraphicEditor dengan melakukan passing parameter ke kelas GraphicEditor. Hal ini juga menunjukan bahwa diterapkannya **Liskov Subtitute Principle (LSP)**  
## 3. Detail Printer
Tujuan dari latihan ini, yaitu DetailPrinter tidak perlu mengecek employee yang diberikan. DetailPrinter hanya perlu menampilkan detail untuk semua jenis employee.

Untuk mencapai tujuan tersebut, sama seperti sebelumnya yaitu dengan menerapkan **Open/Closed Principle**

## 5. Security Door 
Diberikan suatu kelas:

- SecurityManager
- abstract kelas SecurityCheck
- interface SecurityUI

SecurityManager dapat berinteraksi dengan user dengan memvalidasi keycard atau dengan kode pin. Kedua method tersebut terdapat pada interface SecurityUI. Validasi dilakukan oleh kelas SecurityCheck.

Pada latihan ini diterapkan **Interface Segregation Principle** dimana terdapat beberapa interface dengan tujuan spesifik daripada satu interface tetapi memiliki banyak tujuan. Hal ini terlihat dari pembuatan ISecurity yang dipecah menjadi dua interface yang berbeda (IRequestKeyCard dan IRequestPinCode) sehingga inheritance terhadap ISecurity.  

prinsip **Open/Closed Principle** diterapkan pada kelas ScannerUI yang implements terhadap ISecurity. Selain itu diterapkan  **Dependency Inversion Principle** dimana Bergantung pada Abstraksi. hal ini terlihat pada kelas yang inheretance pada kelas abstract SecurityCheck.
