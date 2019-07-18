package com.github.yoshiyoshifujii.cdk

import software.amazon.awscdk.core.{App => CDKApp}

object Main extends App {

  val app = new CDKApp()

  new ExampleStack(app, "example-stack")

  app.synth()

}
