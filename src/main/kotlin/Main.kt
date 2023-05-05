import java.awt.BorderLayout
import javax.swing.*

class Main {
    init {
        val frame = JFrame("Flavor")
        val tabbedPane = JTabbedPane()
        frame.isVisible = true
        frame.layout = BorderLayout()
        frame.add(tabbedPane)
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setSize(800, 800)

        // Create the first tab
        val panel1 = JPanel()
        val label1 = JLabel("This is the first tab.")
        panel1.add(label1)
        tabbedPane.addTab("Tab 1", panel1)

        // Create the second tab
        val panel2 = JPanel()
        val label2 = JLabel("This is the second tab.")
        panel2.add(label2)
        tabbedPane.addTab("Tab 2", panel2)

        tabbedPane.addChangeListener { event ->
            val source = event.source
            if (source is JTabbedPane) {
                val selectedIndex = source.selectedIndex
                if (selectedIndex == 1) {
                    // Do something when the second tab is selected
                    JOptionPane.showMessageDialog(frame, "Selected Tab 2!")
                }
            }
        }
    }
}
fun main() {
    Main()
}