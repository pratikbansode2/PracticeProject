package com.practice.painting

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class SignUpActivity : AppCompatActivity() {

    private var mAuth: FirebaseAuth? = null
    var edtEmail: EditText? = null
    var edtPassword: EditText? = null
    var btnSignUp: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        mAuth = FirebaseAuth.getInstance()
        edtEmail = findViewById(R.id.editTextEmail)
        edtPassword = findViewById(R.id.editTextPassword)
        btnSignUp = findViewById(R.id.buttonSignUp)

        btnSignUp!!.setOnClickListener {
//            val email = edtEmail!!.text.toString()
//            val password = edtPassword!!.text.toString()
//            if (email.isEmpty()) {
//                Toast.makeText(
//                    this, "Email Id Cannot be empty.",
//                    Toast.LENGTH_SHORT
//                ).show()
//            } else if (password.isEmpty()) {
//                Toast.makeText(
//                    this, "Password Cannot be empty.",
//                    Toast.LENGTH_SHORT
//                ).show()
//            } else if (email.isEmpty() && password.isEmpty()) {
//                Toast.makeText(
//                    this, "Cannot be empty.",
//                    Toast.LENGTH_SHORT
//                ).show()
//            } else {
//                mAuth!!.createUserWithEmailAndPassword(email, password)
//                    .addOnCompleteListener(this) { task ->
//                        if (task.isSuccessful) {
//                            // Sign in success, update UI with the signed-in user's information
//                            val user = mAuth!!.getCurrentUser()
//                            var i = Intent(this, HomeActivity::class.java)
//                            startActivity(i)
//                        } else {
//                            // If sign in fails, display a message to the user.
//                            Toast.makeText(
//                                this, "Authentication failed.Check Email Id.",
//                                Toast.LENGTH_SHORT
//                            ).show()
//                        }
//                    }
//            }
//        }

            var i = Intent(this, ClassSelection::class.java)
            startActivity(i)
        }
    }
}
