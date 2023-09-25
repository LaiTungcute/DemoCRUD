**Mô tả bài toán**
- Sử dụng Spring Boot và MySQL để tạo 1 API quản lý users với các chức năng sau
   + Hiển thị các users
   + Hiển thị user qua ID
   + Thêm user
   + Sửa user
   + Xóa user

**Công nghệ sử dụng: Java Spring, MySQL**
**Các bước sử dụng**
- Tạo project bằng kênh start.spring.io và thêm các dependencies vào project
![image](https://github.com/LaiTungcute/DemoCRUD/assets/90131766/a84461f0-b892-4633-955f-99658fb5c791)

- Hàm main
![image](https://github.com/LaiTungcute/DemoCRUD/assets/90131766/7e3072c6-b412-4d7f-a280-e9b8ec53359a)

- Cấu trúc thư mục
![image](https://github.com/LaiTungcute/DemoCRUD/assets/90131766/de744fff-df28-4c11-b3cb-75fdc5651109)

- Cấu hình kết nối với CSDL MySQL
![image](https://github.com/LaiTungcute/DemoCRUD/assets/90131766/cfc27460-1d08-46bb-a8ff-9d5f828437c0)

- Tạo model dùng để ánh xạ sang thành bảng trên MySQL
![image](https://github.com/LaiTungcute/DemoCRUD/assets/90131766/c530db52-79b2-40b3-b5ba-b9ca5e9ffd9c)

- Tạo 1 Repository kế thừa interface JpaRepository
![image](https://github.com/LaiTungcute/DemoCRUD/assets/90131766/51e97f2f-7dec-4973-847d-20f5dd43ae83)

- Tạo 1 Controller có các chức năng 
   + Hiển thị các users
   + Hiển thị user qua ID
   + Thêm user
   + Sửa user
   + Xóa user

![image](https://github.com/LaiTungcute/DemoCRUD/assets/90131766/9b37d3ba-8548-4df1-b0e4-5e01657a81e8)

![image](https://github.com/LaiTungcute/DemoCRUD/assets/90131766/389d620d-7509-475b-9a04-9eed8a870c74)

- Tạo các xử lý ngoại lệ
![image](https://github.com/LaiTungcute/DemoCRUD/assets/90131766/90942425-f079-4565-80e1-3519fbb02ab4)
![image](https://github.com/LaiTungcute/DemoCRUD/assets/90131766/03247405-fd34-481a-a84c-25637a5dd79b)

**Test dữ liệu**
- Thêm user
![image](https://github.com/LaiTungcute/DemoCRUD/assets/90131766/43c51d48-3965-4146-807d-96e47394516c)

- Lấy tất cả user
![image](https://github.com/LaiTungcute/DemoCRUD/assets/90131766/28aeb237-1a5e-4c60-98f2-1af8d8c62aaa)

- Lấy user theo ID
![image](https://github.com/LaiTungcute/DemoCRUD/assets/90131766/88ad1e95-ed01-40c2-bd82-be4d27c1128a)

- Sửa user theo ID
![image](https://github.com/LaiTungcute/DemoCRUD/assets/90131766/dc04c57a-d4ae-4014-b3d8-b73710f76c19)

- Xóa user theo ID
![image](https://github.com/LaiTungcute/DemoCRUD/assets/90131766/7c7732ce-86c9-47e2-a269-d941549faf78)

- Bảng user sau khi xóa
![image](https://github.com/LaiTungcute/DemoCRUD/assets/90131766/c7a38b4b-6c0c-4d2d-a24f-060b506f9590)



