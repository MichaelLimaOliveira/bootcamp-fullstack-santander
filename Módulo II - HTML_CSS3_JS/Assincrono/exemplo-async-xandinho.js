function resolvePromise(execucao) {
    return new Promise((resolve, reject) => {
      const result = `exec: ${execucao}`;
      resolve(result);
    });
  }
  
  function thenFunc() {
    resolvePromise("resolvedThen")
      .then((resultado) => {
        console.log({ resultado });
        console.log("after resolve thenFunc");
      })
      .catch((error) => console.log({ error }));
  
    console.log("before resolve thenFunc");
  }
  
  async function awaitFunc() {
    try {
      const response = await resolvePromise("resolvedAwait");
      console.log({ response });
      console.log("after resolve awaitFunc");
    } catch (error) {
      console.log({ error });
    }
  }
  
  function bootstrap() {
    thenFunc();
    awaitFunc();
    console.log("before resolve awaitFunc");
  }
  
  bootstrap();