# MD05 - Session 10 - Homework

## Bài tập 1: Khởi tạo và kết nối VPS

### 1. Thông tin VPS (môi trường Staging)

| Thông số        | Giá trị                          |
|-----------------|----------------------------------|
| Nhà cung cấp    | WiServices Cloud                 |
| Hostname        | `devops-rikkei-chuong`           |
| Hệ điều hành    | Ubuntu 22.04.5 LTS               |
| Kernel          | 5.15.0-143-generic (x86_64)      |
| CPU / RAM / Ổ đĩa | 1 vCPU / 1 GB / 20 GB          |
| IP public       | `221.121.2.29`                   |
| Trạng thái      | Running                          |
| User đăng nhập  | `deployer` (user thường, không dùng `root`) |
| Phương thức xác thực | SSH key (không dùng password) |

### 2. Cấu hình thông số VPS trên giao diện Cloud

![Cấu hình VPS](docs/images/bt1-vps-config.png)

### 3. Kết nối SSH vào VPS

Từ PowerShell trên máy cá nhân (Windows), kết nối bằng SSH key:

```powershell
ssh deployer@221.121.2.29
```

Kết quả đăng nhập thành công (prompt `deployer@devops-rikkei-chuong:~$`):

![Đăng nhập SSH thành công](docs/images/bt1-ssh-login.png)

### 4. Ghi chú về bảo mật

- Đăng nhập bằng **SSH key** thay vì password: private key nằm trên máy cá nhân, chỉ public key được đặt vào `~/.ssh/authorized_keys` của user `deployer` trên VPS, tránh bị brute-force mật khẩu.
- Sử dụng user riêng `deployer` thay vì `root` để triển khai ứng dụng, giới hạn quyền khi có sự cố.
- Có thể tăng cường thêm trong `/etc/ssh/sshd_config`:
  ```
  PasswordAuthentication no
  PermitRootLogin no
  ```
