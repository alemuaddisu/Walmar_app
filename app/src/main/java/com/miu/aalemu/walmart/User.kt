package com.miu.aalemu.walmart

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable

data class User(val firstName: String?, val lastName:String?, val userName:String?, val password:String?):
    Serializable
//{
//    constructor(parcel: Parcel) : this(
//        parcel.readString(),
//        parcel.readString(),
//        parcel.readString(),
//        parcel.readString()
//    ) {
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }
//
//    override fun writeToParcel(p0: Parcel?, p1: Int) {
//        p0?.writeString(this.firstName)
//        p0?.writeString(this.lastName)
//        p0?.writeString(this.userName)
//        p0?.writeString(this.password)
//
//    }
//
//    companion object CREATOR : Parcelable.Creator<User> {
//        override fun createFromParcel(parcel: Parcel): User {
//            return User(parcel)
//        }
//
//        override fun newArray(size: Int): Array<User?> {
//            return arrayOfNulls(size)
//        }
//    }
//}