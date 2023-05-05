import java.awt.BorderLayout
import javax.swing.JButton
import javax.swing.JFrame

fun main() {
    val frame = JFrame("Flavor")
    val button = JButton("Test")
    val button2 = JButton("Test2")
    frame.isVisible = true
    frame.layout = BorderLayout()
    frame.add(button, BorderLayout.CENTER)
    frame.add(button2, BorderLayout.SOUTH)
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
}