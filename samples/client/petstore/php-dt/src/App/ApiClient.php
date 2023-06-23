<?php
declare(strict_types=1);

namespace App;

use Articus\DataTransfer as DT;
use OpenAPIGenerator\APIClient as OAGAC;
use Psr\Http\Client\ClientExceptionInterface;
use Psr\Http\Message\ResponseInterface;

/**
 * dummy
 * dummy
 * The version of the OpenAPI document: dummy
 */
class ApiClient extends OAGAC\AbstractApiClient
{
    //region dummy
    /**
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function dummyRaw(
        string $responseMediaType = '*/*'
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
    public function dummy(
        string $responseMediaType = '*/*'
    ): array
    {
        $response = $this->dummyRaw($responseMediaType);
        $responseContent = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* dummy */
                $responseContent = new \App\DTO\Dummy200Response();
                break;
        }
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param string $responseMediaType
     * @return \App\DTO\Dummy200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function dummyResult(
        string $responseMediaType = '*/*'
    ): \App\DTO\Dummy200Response
    {
        return $this->getSuccessfulContent(...$this->dummy($responseMediaType));
    }
    //endregion
}

