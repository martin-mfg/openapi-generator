<?php
declare(strict_types=1);

namespace App;

use Articus\DataTransfer as DT;
use OpenAPIGenerator\APIClient as OAGAC;
use Psr\Http\Client\ClientExceptionInterface;
use Psr\Http\Message\ResponseInterface;

/**
 * 
 * dummy description
 * The version of the OpenAPI document: 
 */
class ApiClient extends OAGAC\AbstractApiClient
{
    //region retrieveSomething
    /**
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function retrieveSomethingRaw(
        string $responseMediaType = '/'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/example/someMethod', [], []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function retrieveSomething(
        string $responseMediaType = '/'
    ): array
    {
        $response = $this->retrieveSomethingRaw($responseMediaType);
        $responseContent = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* The response with results */
                $responseContent = new \App\DTO\ExampleResponse();
                break;
        }
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param string $responseMediaType
     * @return \App\DTO\ExampleResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function retrieveSomethingResult(
        string $responseMediaType = '/'
    ): \App\DTO\ExampleResponse
    {
        return $this->getSuccessfulContent(...$this->retrieveSomething($responseMediaType));
    }
    //endregion
}

