import java.awt.BorderLayout
import javax.swing.*

class Main {
    init {
        val frame = JFrame("Flavor")
        val tabbedPane = JTabbedPane()
        val panel = JPanel()
        frame.isVisible = true
        frame.layout = BorderLayout()
        frame.add(tabbedPane)
        tabbedPane.addTab("Test", panel)
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setSize(800, 800)
        val tabComponent = tabbedPane.getComponentAt(0)
        if (tabComponent is JPanel) {
            val button = JButton("Test")
            button.addActionListener {
                JOptionPane.showMessageDialog(frame, "Button clicked on Tab 2!")
            }
            tabComponent.add(button)
        }
    }
}
fun main() {
    Main()
}