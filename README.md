# APPL1-SOLID
Latihan Prisnsip SOLID oleh Hanifah Sholihat 181524012

## 1. Stream Progress
Tujuan dari latihan ini yaitu melakukan refactor agar StreamProgressInfo dapat bekerja dengan berbagai jenis Streaming. Dalam hal ini digunakan **Open/Closed Principle (OCP)** dimana suatu kelas harus **"open"** terhadap ekstensi tetapi **"close"** untuk modifikasi. OCP dilakukan dengan membuat interface yaitu IStreamable yang memiliki method abstrak Length dan method abstrak Bytes dan kelas Streamable( File dan Music) mengimplementasikan interface IStreamable. Sehingga dengan prinsip ini kita dapat menambah fitur baru tanpa mengubah suatu kelas yang telah dibuat .
Selain itu, terdapat prinsip lain yang digunakan yaitu **Liskov Subtitute Principle (LSP)**  dengan membuat StreamProgressInfo memiliki tipe IStreamable. Jadi,setiap kelas yang mengimplementasikan IStremable dapat dilewatkan sebagai argumen ke dalam kelas StreamProgresInfo. 
## 2. Graphic Editor

## 3. Detail Printer
## 5. Security Door 
