package com.example.fragment_update

import java.io.Serializable

// Đảm bảo StudentModel có thể được truyền qua Bundle
data class StudentModel(
    var studentName: String,  // Tên sinh viên
    var studentId: String     // Mã số sinh viên
) : Serializable