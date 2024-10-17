fun main() {
    val student:Student? = Student()

    student?.let { st ->
        st.hello()
        st.name = "First-year student"
    }
    println(student?.name)
    student?.apply {
        name = "Second-year student"
        hello()
    }
    println(student?.name)

    val r = Student().run {
        name = "Third-year student"
        hello()
        age.toString()
    }
    println(r)

    val t = with(Student()) {
        name = "Fourth-year student"
        hello()
        age = 21
        age.toString()
    }
    println(t)

    val q = Student().also { st ->
        st.name = "Fifth-year student or Master's degree"
        st.hello()
        st.age = 23
        st.age.toString()
    }
    println(q)
}