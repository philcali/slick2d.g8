package $package$

import org.newdawn.slick.AppGameContainer
import org.newdawn.slick.{BasicGame, GameContainer, Graphics, Color}

object $game_class$ {
  def main(args: Array[String]) = {
    val container = new AppGameContainer(new $game_class$, 800, 600, false)

    container.setTargetFrameRate(60)
    container.start
  }
}

class $game_class$ extends BasicGame("$name$") {
  var current = new java.util.Date()

  override def init(gc: GameContainer) {
    println("Initialized $game_class$")
  }

  override def update(gc: GameContainer, delta: Int) {
    current = new java.util.Date()
  }

  override def render(gc: GameContainer, g: Graphics) {
    g.setColor(Color.white)
    g.drawString("Hello $name$, %s".format(current), 200, 10)
  }
}
