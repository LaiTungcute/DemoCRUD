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
![image](https://github.com/LaiTungcute/DemoCRUD/assets/90131766/230420c9-e1a3-4b1f-b32c-9a0abeb58f55)

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


