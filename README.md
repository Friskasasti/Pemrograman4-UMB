# 📱 Android Login & Register App with SQLite

A simple Android application that allows users to register and login using local SQLite database. Built with Java, XML, and SQLite using Android Studio.

---

## 🚀 Features

- Register with Name, Email, Password, and Confirm Password  
- Login using registered Email and Password  
- Input validation:  
  - Valid email format  
  - Password minimum 6 characters  
  - Password and confirmation must match  
- Store user data locally using SQLite  
- Display welcome message with user name after login  

---

## 🧭 Alur Aplikasi

### Aplikasi Dibuka  
- Langsung menampilkan halaman **Login**.

### Login  
- User mengisi **Email** dan **Password**  
- Validasi:  
  - Format email harus valid  
  - Password minimal 6 karakter  
- Jika login sukses:  
  - Arahkan ke halaman `MainActivity`  
  - Tampilkan: `Selamat Datang, [Nama User]`  
- Jika gagal:  
  - Tampilkan pesan error  
- Tersedia tombol untuk berpindah ke halaman **Register**

### Register  
- User mengisi:  
  - Nama  
  - Email  
  - Password  
  - Konfirmasi Password  
- Validasi:  
  - Semua input harus diisi  
  - Email harus valid  
  - Password dan konfirmasi minimal 6 karakter dan harus cocok  
  - Email belum pernah digunakan  
- Jika valid:  
  - Simpan data ke SQLite  
  - Arahkan ke halaman **Login**

### MainActivity  
- Menampilkan pesan:  
  `Selamat Datang, [Nama User]`

---

## Tampilan Aplikasi
<table>
  <tr>
    <td><strong>Tampilan Login</strong></td>
    <td><strong>Tampilan Register</strong></td>
    <td><strong>Tampilan main activity</strong></td>
  </tr>
  <tr>
    <td><img src="gambar/Screenshot 2025-05-24 153652.png" width="250"/></td>
    <td><img src="gambar/Screenshot 2025-05-24 153636.png" width="250"/></td>
    <td><img src="gambar/Screenshot 2025-05-24 153727.png" width="250"/></td>
  </tr>
  <tr>
    <td><strong>Register email tidak valid</strong></td>
    <td><strong>Register Password tidak sesuai ketentuan</strong></td>
  </tr>
  <tr>
    <td><img src="gambar/Screenshot 2025-05-24 153834.png" width="250"/></td>
    <td><img src="gambar/Screenshot 2025-05-24 153859.png" width="250"/></td>
  </tr>
  <tr>
    <td><strong>Register Berhasil</strong></td>
    <td><strong>Login Salah</strong></td>
  </tr>
  <tr>
    <td><img src="gambar/Screenshot 2025-05-24 153924.png" width="300"/></td>
      <td><img src="gambar/Screenshot 2025-05-24 154005.png" width="300"/></td>
  </tr>
  <tr>
    <td><strong>Login Berhasil</strong></td>
    <td><strong>Email sudah terdaftar</strong></td>
  </tr>
  <tr>
    <td><img src="gambar/Screenshot 2025-05-24 154022.png" width="300"/></td>
      <td><img src="gambar/Screenshot 2025-05-24 154146.png" width="300"/></td>
  </tr>
</table>

## 🛠️ Tools & Teknologi

- Java  
- XML Layouts  
- Android Studio  
- SQLite  
- Toast & Intent handling  

---

## 📦 Cara Menjalankan

1. Clone atau download project ini  
2. Buka dengan Android Studio  
3. Jalankan di emulator atau perangkat fisik  
4. Lakukan proses register, lalu login  

---

## 📦 Cara Menjalankan
---
Nama : Friska Sasti
NIM : 220220022
Semester : 6

## 📄 License

This project is intended for educational purposes and open for learning or improvement.

---

*Happy coding!* 🚀
