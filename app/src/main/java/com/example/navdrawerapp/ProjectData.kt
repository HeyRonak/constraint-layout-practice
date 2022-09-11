package com.example.navdrawerapp

object ProjectData {

//     private var title = arrayOf(
//         "Medical app",
//         "Making tech Notes",
//         "Tech Updates"
//     )
//
//    private var progress = arrayOf(
//        "9 hours progress",
//        "2 hours progress",
//        "5 hours progress"
//    )
//
//    private var percentage = arrayOf(
//        "25%",
//        "60%",
//        "10%"
//    )

    fun getProjectData(): ArrayList<Projects> {

        val list : ArrayList<Projects> = arrayListOf()

        list.add(Projects( "Medical app",  "9 hours progress",   "25%"))
        list.add(Projects(  "Making tech Notes",   "2 hours progress",   "60%"))
        list.add(Projects( "Tech Updates",  "5 hours progress",   "10%"))

        return list

    }


}